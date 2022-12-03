// Program to implement Pass-2 assembler.

import java.io.*;
import java.util.*;

class Pass-2_Assembler
{
public static void main(String args[])throws Exception
 {

String s;
String s1[]=new String[70];
String s2[]=new String[70];
String s3[]=new String[70];


FileWriter f1=new FileWriter("output3.txt");
BufferedWriter  b1=new BufferedWriter(f1);

FileReader f2=new FileReader("intermedi1.txt");
BufferedReader b2=new BufferedReader(f2);

FileReader f3=new FileReader("symbol2.txt");
BufferedReader b3=new BufferedReader(f3);

FileReader f4=new FileReader("literal2.txt");
BufferedReader b4=new BufferedReader(f4);

int m=0;
while((s=b2.readLine())!=null)
{
	
	StringTokenizer st=new StringTokenizer(s);
	while(st.hasMoreTokens())
	{
	s1[m]=st.nextToken();
	m++;
       }
}
int m1=0;
while((s=b3.readLine())!=null)
{
	
	StringTokenizer st=new StringTokenizer(s);
	while(st.hasMoreTokens())
	{
	s2[m1]=st.nextToken();
	m1++;
       }
}
int m2=0;
while((s=b4.readLine())!=null)
 {
	
	StringTokenizer st=new StringTokenizer(s);
	while(st.hasMoreTokens())
	{
	s3[m2]=st.nextToken();
	m2++;
       }
 }

for(int i=0;i<m;i++)
{
	if("AD".equals(s1[i]) && "01".equals(s1[i+1]))
	{	
	b1.write("");
	}
	if("R1".equals(s1[i])||"R2".equals(s1[i])||"R3".equals(s1[i])||"R4".equals(s1[i]))
	{
	b1.write("\t"+s1[i]);
	b1.write(" ");


	}
       if("IS".equals(s1[i]))
	{
		b1.write(s1[i-1]+"\t");
 		b1.write(s1[i+1]);
	}
	
	if("L".equals(s1[i]))
	{
	
	for(int j=0;j<m2;j++)
	{
	    if(s1[i+1].equals(s3[j]))
	   {
           b1.write("\t");
     	   b1.write(s3[j+2]+"\n");
	   }

        }
	}

	if("S".equals(s1[i]))
	{
	
	for(int j=0;j<m1;j++)
	{
	    if(s1[i+1].equals(s2[j]))
	   {
             b1.write("\t");
     	     b1.write(s2[j+2]+"\n");
	   }

        }
	}

       if("DL".equals(s1[i])&&"01".equals(s1[i+1]))
         {
            b1.write(s1[i-1]+"\t");
             b1.write("-"+"\t");
             b1.write("-");
             b1.write("\t");
            b1.write("00"+s1[i+3]+"\n");
 
         }
if(s1[i].equals("AD") && s1[i+1].equals("02"))
	{	
	b1.write(s1[i-1]+"\t");
        b1.write("-"+"\t");
        b1.write("-");
        b1.write("\t");
	b1.write("00"+s1[i+3]+"\n");
	}
	 
}	

b1.close();
b2.close();
b3.close();
b4.close();
  }
}



// Input Files:

// intermedi1.txt
// AD 01 C 100
// 100       IS     05     R1  L  1

// 101       IS     06     R2 S  1

// 102       IS     03     R1  L  2

// 103       AD     04     R1  L  2

// 104       IS     06     R1 S  1

// 105  

// 106       IS     02

// 107       DL     01

// 108       DL     02

// 109  AD 02 C 1

// 110  AD 02 C 2



// symbol2.txt
// L1 100
//  X 107
//  Y 108

// literal2.txt
// 1 =7
//  2 =2

// *************************************OUTPUT********************************

// output3.txt
// 100	05	R1 	2
// 101	06	R2 
// 102	03	R1 	null
// 	R1 	null
// 104	06	R1 
// 106	02
// 107	-	-	00DL
// 109	-	-	001
// 110	-	-	002




// This code is contributed by Prof. Anand Gharu
