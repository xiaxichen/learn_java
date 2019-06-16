#System
##System.in
调用键盘输入
##System.out.println()
打印输入内容自动换行
##Scanner
获取输入内容
###demo
```java
Scanner input = new Scanner(System.in)
if (input.hasNext()){
    int line = input.nextInt();
}
input.close();
```
##scan.hasNext()
判断是否有输入

##Random
随机数
```java
Random r = new Random()//创建一个可以生成随机数的实例
r.nextInt(50)
```