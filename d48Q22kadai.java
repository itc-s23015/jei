enum Connection {OFFLINE, ONLINE}
// s23015
// d48Q22のコードのエラーを発生させないように修正
class d48Q22kadai {
     public static void main(String[] args){
	Connection s = Connection.OFFLINE;
	if(s == Connection.OFFLINE){
		s = Connection.ONLINE;
	}
	System.out.println(s);
     }
}

