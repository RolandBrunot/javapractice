package lesson2;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 0; a < 0b1000000; a++) {
			if (a > 0b010000) {
				if (((a & 0b100011) == 0b100001) || ((a & 0b100011) == 0b000011) || ((a & 0b100011) == 0b100010)) {
					if (((a & 0b011000) == 0b011000) || ((a | 0b100111) == 0b100111)) {
						if (((a & 0b100100) == 0b100000) || ((a | 0b100100) == 0b000100)) {
							if (((a & 0b001100) == 0b001000) || ((a | 0b001100) == 0b000100)) {
								if ((a & 0b000110) != 0b000010) {
									System.out.println("����ΪA��F�ĳ�ϯ���:");
									if ((a & 0b100000) == 0b100000)
										System.out.println("A�μӻ���");
									else
										System.out.println("A���μӻ���");
									if ((a & 0b010000) == 0b010000)
										System.out.println("B�μӻ���");
									else
										System.out.println("B���μӻ���");
									if ((a & 0b001000) == 0b001000)
										System.out.println("C�μӻ���");
									else
										System.out.println("C���μӻ���");
									if ((a & 0b000100) == 0b000100)
										System.out.println("D�μӻ���");
									else
										System.out.println("D���μӻ���");
									if ((a & 0b000010) == 0b000010)
										System.out.println("E�μӻ���");
									else
										System.out.println("E���μӻ���");
									if ((a & 0b000001) == 0b000001)
										System.out.println("F�μӻ���");
									else
										System.out.println("F���μӻ���");
								}
							}
						}
					}
				}
			}
		}
	}

}
