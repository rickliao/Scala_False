object False {
	def main(args: Array[String]) {
		False START "12+";
	}

	def START(prog: String) = {
		var progAr = prog.toCharArray;
		for(i:Int <- 0 until progAr.length){
			println(progAr(i));
		}
	}

	
	
}
