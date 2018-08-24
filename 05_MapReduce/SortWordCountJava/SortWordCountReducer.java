import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class SortWordCountReducer extends Reducer<IntWritable, Text, Text, IntWritable>
{

  private IntWritable wordCountWritable = new IntWritable();
  @Override
   public void reduce(IntWritable key, Iterable<Text> values, Context context)
             throws IOException, InterruptedException {

         for (Text value : values) {
            context.write(value,key);
         }
    }
}
