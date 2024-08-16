// s23015
// コマンドラインから与えられた整数を指定するように変更した
class d5Q27kadai {
    public static void main(String[] args) {
	int control = 3;
	String mode;
	
	switch (control) {
	   case 1:
	      mode = "warm";
	      break;
	   case 2:
	      mode = "cool";
	      break;
	   case 3:
	      mode = "wind";
	      break;
	   default:
	      mode = "not found";
	      break;
	}
	System.out.print(mode);	
    }
}
		 
