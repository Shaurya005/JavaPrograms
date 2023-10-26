package DataStructures;

// Java program for implementation of FCFS scheduling
public class SchedulingAlgorithm {
	public static void main(String[] args) {
		int processes[] = {1, 2, 3}; //process id's
		int n = processes.length;
		int burst_time[] = {10, 5, 8}; //Burst time of all processes
		findavgTime(processes, n, burst_time);
	}

	static void findavgTime(int processes[], int n, int bt[]) {
		int wt[] = new int[n], tat[] = new int[n];
		int total_wt = 0, total_tat = 0;
		wt[0] = 0;
		for (int i = 1; i < n; i++)
			wt[i] = bt[i - 1] + wt[i - 1];
		for (int i = 0; i < n; i++)
			tat[i] = bt[i] + wt[i];

		// Display processes along with all details
		System.out.printf("Processes  Burst time  Waiting time  Turn around time\n");

		// Calculate total waiting time and total turn around time
		for (int i = 0; i < n; i++) {
			total_wt = total_wt + wt[i];
			total_tat = total_tat + tat[i];
			System.out.printf(" %10d ", (i + 1));
			System.out.printf("	 %10d ", bt[i]);
			System.out.printf("	 %15d", wt[i]);
			System.out.printf("	 %15d\n", tat[i]);
		}
		float s = (float) total_wt / (float) n;
		int t = total_tat / n;
		System.out.printf("Average waiting time = %f", s);
		System.out.printf("\n");
		System.out.printf("Average turn around time = %d ", t);
	}
}