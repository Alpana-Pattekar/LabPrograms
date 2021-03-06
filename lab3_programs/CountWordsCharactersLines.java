package lab3_programs;

import java.io.*;

public class CountWordsCharactersLines {
	static int lines=0,words=0,chara=0;
	public static void wordCount(InputStreamReader isr) throws IOException {
		int c=0;
		while((c=isr.read())!=-1) {
			chara++;
			if(c=='n')
				lines++;
			if((c=='n') || (c==' ') || (c=='t'))
				++words;
		}
	}
	public static void main(String rr[])throws IOException {
		if(rr.length==0) {
			System.out.println("Enter the text: ");
			wordCount(new InputStreamReader(System.in));
		}
		else {
			FileReader fr = new FileReader(rr[0]);
			wordCount(fr);
		}
		System.out.println("Number of Words: "+words);
		System.out.println("Number of Characters: "+chara);
		System.out.println("Number of Lines: "+lines);
	}

}
