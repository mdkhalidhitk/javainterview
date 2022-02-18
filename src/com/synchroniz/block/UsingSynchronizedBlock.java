package com.synchroniz.block;

class FirstOne
{
 public void display(String msg)
 {
  System.out.print ("["+msg);
  try
  {
   Thread.sleep(1000);
  }
  catch(InterruptedException e)
  {
   e.printStackTrace();
  }
  System.out.println ("]");
 }
}

class SecondOne extends Thread
{
 String msg;
 FirstOne fobj;
 SecondOne (FirstOne fp,String str)
 {
  fobj = fp;
  msg = str;
  start();
 }
 public void run()
 {
   synchronized(fobj)  {
  fobj.display(msg);
   }
 }
}

public class UsingSynchronizedBlock
{
 public static void main (String[] args)
 {
  FirstOne fnew = new FirstOne();
  SecondOne ss = new SecondOne(fnew, "welcome");
  SecondOne ss1= new SecondOne (fnew,"new");
  SecondOne ss2 = new SecondOne(fnew, "programmer");
 }
}
