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
##Array
二分查找
```java
Arrays.binarySearch(int[] arrry,int value)
```
字符串输出
```java
Arrays.toString(int[] arrry)
```
数组排序
```java
Arrays.sort(int[] array)
```
复制指定数组
```java
Arrays.copyOf(int[]array,int length);
Arrays.copyOf(int[]array,int From,int to);
System.arraycopy(Object src,int scrPos,Object dest,int destPort,int length)
```
判断两个数组是否相等
```java
Arrays.equels()
```
使用指定元素填充数组
```java
Arrays.fill()
```
