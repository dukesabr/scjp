package br.scjp.chapter.five;

public class Emu {
	
	static String s = "-";
	
	public static void main(String[] args){
		try {
			throw new Exception();
		}catch (Exception e) {
			try {
				try {
					throw new Exception();
				} catch (Exception e3) {
					s += "ic ";
				}
			} catch (Exception e2) {
				s += "mc ";
			} finally {
				s += "mf ";
			}
		} finally{
			s += "of ";
		}System.out.println(s);
	}

}
