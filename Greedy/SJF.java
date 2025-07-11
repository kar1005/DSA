//Implenting SJF (Shortest Job First) scheduling algorithm
// to find the average waiting time of processes in a non-preemptive manner.
// This algorithm sorts the processes based on their burst time and calculates the average waiting time.
// The waiting time for each process is the sum of the burst times of all previous processes.
import java.util.Arrays;
class SJF{
    public int findAvgWaitingTime(int processes[]) {
        Arrays.sort(processes);
        int n = processes.length;
        int waitingTime = 0;
        int totalWaitingTime = 0;
        for (int i = 0; i < n; i++) {    
            waitingTime += processes[i];
            totalWaitingTime += waitingTime;
        }
        return totalWaitingTime / n;
    }
}