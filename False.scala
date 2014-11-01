import scala.collection.mutable.Stack

object False {
	def main(args: Array[String]) {
		False START "12546540+";
	}

	//The main prog
	var prog = Array.ofDim[Char](0);
	//The stack
	val stack = new Stack[Int];
	
	def START(mainProg: String) = {
		prog = mainProg.toCharArray;
		var i = 0;
		while(i < prog.length) {
			val cur = prog(i);
			cur match {
				case '1' => {
					val strNum:String = getInt(i);
					stack.push(strNum.toInt);
					i = i + strNum.length-1;
				}
				case '2' => stack.push(2);
				case _ => false;
			}
			i = i+1;
		}
		println(stack.toString);
	}

	def getInt(start:Int): String = {
		var ret = new String;
		for(i:Int <- start until prog.length) {
			if(prog(i).isDigit) {
				ret = ret + prog(i);
			}
		}
		ret
	}

	
	
}
