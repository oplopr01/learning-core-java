
	-----------copy given string n times and create new string by it----------

	
Problem-: Given a string and a non-negative int n, return a larger string that is n copies of the original string.



public String stringTimes(String str, int n) {
  String temp="";
  for(int i =0;i<n;i++){
    temp+=str;
  }
    return temp;
}
