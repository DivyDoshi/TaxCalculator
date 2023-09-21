

public class Student extends Person {
		private int Enrollno;
		private int Result;
		public int getEnrollno() {
			return Enrollno;
		}
		public void setEnrollno(int enrollno) {
			Enrollno = enrollno;
		}
		public int getResult() {
			return Result;
		}
		public void setResult(int result) {
			Result = result;
		}
		@Override
		public String toString() {
			return "Student [Enrollno=" + Enrollno + ", Result=" + Result + "]";
		}

}
