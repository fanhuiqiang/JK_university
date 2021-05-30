package fanhuiqiang.week04;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 *
 * 一个简单的代码参考：
 */
public class HomeWork02 {

public static volatile long result = 0;
public static void main(String[] args) throws Exception {
        
        long start=System.currentTimeMillis();
        
        
       
        // 在这里创建一个线程或线程池，
        //result=sum();
        //第一个方法
		/*
		 * change(); Thread.sleep(2000);
		 */
      //第二个方法
       // change2();
        
      //第三个方法
         change3();
       
        
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);
         
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        
        // 然后退出main线程
}

private static void change() {
	
	 Runnable task = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub 
				 result=5;
			}
			
     };
     Thread thread = new Thread(task);
     thread.start();
    
}

private static void change2() throws Exception {
	
	 Runnable task = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub 
				 result=5;
			}
			
    };
    Thread thread = new Thread(task);
    thread.start();
    thread.join();
   
}

private static void change3() throws Exception {
	
	 Runnable task = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub 
				 result=5;
			}
			
   };
   Thread thread = new Thread(task);
   thread.start();
   synchronized (thread) {
	   thread.wait();
   }
}


private static int sum() {
    return fibo(3);
}

private static int fibo(int a) {
    if ( a < 2) 
        return 1;
    return fibo(a-1) + fibo(a-2);
}
}
