public class TextFormatter {
	private String line;
	
	public TextFormatter(String lineToFormat){line=lineToFormat;}
	
	private int findString(String str, int start){
		for(int i=start; i<line.length(); i++)
			if(	
					line.substring(i, i+1).equals(str)&&
					( i==0 || !line.substring(i-1, i).equals(str) )&&
					( i==line.length()-1 || !line.substring(i+1, i+2).equals(str) )
					)
				return i;
	return -1;	
	}
	
	private int countStrings(String str){
		int ans=0;
		int pos=0;
		while (findString(str, pos)>0){
			ans++;
			pos=findString(str, pos)+1;
		}
		return ans;
	}
	
	public String convertItalics(){
		String ans = "";
		String temp = line;
		if(countStrings("_")%2==0){
			boolean end = false;
			int pos = 0;
			while(findString("_", pos)!=-1){
				int prevPos = findString("_", pos);
				if(end){
					line= line.substring(0, prevPos)+"</I>"+line.substring(prevPos+1);
				}
				else{line= line.substring(0, prevPos)+"<I>"+line.substring(prevPos+1);}
				end=!end;
				pos=prevPos+1;
			}
		}
		ans = line;
		line = temp;
		return ans;
		
	}
	
	
	
}
