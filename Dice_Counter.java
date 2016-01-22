import java.util.*;

public class Dice_Counter {

	public static void main(String[] args) {
		int SIDES = 6;
		double[] dist = new double[2*SIDES+1];
		for (int i = 1; i <= SIDES; i++)
			for (int j = 1; j <= SIDES; j++)
				dist[i+j] += 1.0;
		
		for (int k = 2; k <= 2*SIDES; k++)
			dist[k] /= 36.0;
		
		int N = 0;
		double[] fluff = new double[13];
		do {
			int Q = dicetoss() + dicetoss();
			fluff[Q]++;
			N++;
		} while ( Math.abs(fluff[2]/N - dist[2]) >= 0.001 || 
				Math.abs(fluff[3]/N - dist[3]) >= 0.001 ||
				Math.abs(fluff[4]/N - dist[4]) >= 0.001 ||
				Math.abs(fluff[5]/N - dist[5]) >= 0.001 ||
				Math.abs(fluff[6]/N - dist[6]) >= 0.001 ||
				Math.abs(fluff[7]/N - dist[7]) >= 0.001 ||
				Math.abs(fluff[8]/N - dist[8]) >= 0.001 ||
				Math.abs(fluff[9]/N - dist[9]) >= 0.001 ||
				Math.abs(fluff[10]/N - dist[10]) >= 0.001 ||
				Math.abs(fluff[11]/N - dist[11]) >= 0.001 ||
				Math.abs(fluff[12]/N - dist[12]) >= 0.001
				);
			System.out.print(N);	
	}
	
	public static int dicetoss() {
		double x = Math.random();
		x = x * 6;
		x = x + 1;
		int panda = (int) x;
		return panda;
	}
}