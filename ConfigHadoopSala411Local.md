# COMO CONFIGURAR O HADOOP LOCAL

## 1. ALTERAR O ARQUIVO core-site.xml
```
<property>
<name>hadoop.tmp.dir</name>
<value>/home/sala411/hadoop-${user.name}</value>
</property>
```
## 2. ALTERAR O ARQUIVO startdaemons.sh
```
export HADOOP_HOME=/home/sala411/HadoopVM/hadoop-2.9.1
```
## 3. EXECUTAR NO TERMINAL
```
export HADOOP_HOME=/home/sala411/HadoopVM/hadoop-2.9.1
```
## 4. FORMATAR HDFS
```
$HADOOP_HOME/bin/hdfs namenode -format
```
## 5. INICIAR DAEMONS
```
sh /home/sala411/HadoopVM/startdaemons.sh
jps
```
## 6. CRIAR DIRETÓRIOS NO HDFS
```
$HADOOP_HOME/bin/hadoop fs -mkdir -p /user/$USER
$HADOOP_HOME/bin/hadoop fs -chown $USER:$USER /user/$USER
$HADOOP_HOME/bin/hadoop fs -mkdir /tmp
$HADOOP_HOME/bin/hadoop fs -chmod 777 /tmp
```
## 7. ACESSAR INTERFACE WEB DO HDFS E YARN
  - http://localhost:50070
  - http://localhost:8088
