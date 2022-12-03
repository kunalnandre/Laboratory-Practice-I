//  program to simulate CPU Scheduling Algorithms: FCFS and SJF:-

    
import java.util.*;
public class Main{
 public static void main(String args[]){
     
 int wt[],proc[],tat[],bst[],n,i,j,total=0;

 Scanner sc= new Scanner(System.in);

 System.out.println("Page scheduling MENU: ");
 
 System.out.println(" 1. Using FCFS?");
 System.out.println(" 2. Using SJF?");
 System.out.print("Your Choice==> ");
 int x= sc.nextInt();

 System.out.print("\nNo. of processes: ");
 n=sc.nextInt();
 proc = new int[n];
 wt=new int[n];
 bst=new int[n];
 tat= new int[n];


 switch (x){
 case 1:
 System.out.println("Enter Cpu time: ");
 for(i=0;i<n;i++){
 System.out.print(" Process["+(i+1)+"]: ");
 bst[i]=sc.nextInt();
 proc[i]=i+1;
 }
 wt[0]=0;
 for(i = 1;i<n;i++){
 wt[i]=0;
 for(j=0;j<i;j++){
 wt[i]+=bst[j];
 total+=wt[i];
 }
 }
 System.out.println("\nProcess\t\tBT\tWT\tTAT");
 System.out.println("-------------------------------------");
 for(i=0;i<n;i++){
 tat[i]=wt[i]+bst[i];
 System.out.println("Proc["+proc[i]+"]\t\t"+bst[i]+"\t"+wt[i]+"\t"+tat[i]);
 }
 
 case 2:
 System.out.println("Enter Cpu time: ");
 for(i=0;i<n;i++){
 System.out.print(" Process["+(i+1)+"]: ");
 bst[i]=sc.nextInt();
 proc[i]=i+1;
 }
 for(i=0;i<n;i++){
 int pp=i;
 for(j=i+1;j<n;j++){
 if(bst[j]<bst[pp])
 pp=j;}

 int temp=bst[i];
 bst[i]=bst[pp];
 bst[pp]=temp;

 temp=proc[i];
 proc[i]=proc[pp];
 proc[pp]=temp;
 }
 wt[0]=0;
 for(i = 1;i<n;i++){
 wt[i]=0;
 for(j=0;j<i;j++){
 wt[i]+=bst[j];
 total+=wt[i];
 }
 }
 System.out.println("\nProcess\t\tBT\tWT\tTAT");
 System.out.println("-------------------------------------");
 for(i=0;i<n;i++){
 tat[i]=wt[i]+bst[i];
 System.out.println("Proc["+proc[i]+"]\t\t"+bst[i]+"\t"+wt[i]+"\t"+tat[i]);
 }
 }
 }
 }
