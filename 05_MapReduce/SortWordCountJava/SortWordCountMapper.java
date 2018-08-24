import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class SortWordCountMapper extends Mapper<LongWritable, Text, IntWritable, Text>
{
  private final static IntWritable count = new IntWritable();
  private Text wordObject = new Text();

  @Override
  public void map(LongWritable key, Text value, Context context)
    throws IOException, InterruptedException {

   String line = value.toString();
   String word = line.split("\t")[0];
   int countint = Integer.parseInt(line.split("\t")[1]);
   count.set(countint);
   wordObject.set(word);
   context.write(count, wordObject);
  }
}
