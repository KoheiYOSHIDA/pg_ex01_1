package pg_ex01_1;

public class CommonFunctions extends Main {
	public void StartFunction () {
		//NUMBER配列にint型数値が格納されているか確認
		//0:false 0以外:true
		boolean isCheckBoolean = CheckNUMBERarray();
		if (isCheckBoolean) {
			for(int i=NUM_START;i<=NUM_END;i++) {
				setNumberXBoolean(i);
				setNumberXXBoolean();
				PrintNumber(i);
				resetBoolean();
			}
		}
	}

	//Interface.javaのNUMBER配列の入力チェック
	public boolean CheckNUMBERarray() {
		if(NUMBER_X.length == 0) {
			return false;
		}
		return true;

	}

	public void setNumberXBoolean(int num) {
		for(int j=0;j<NUMBER_X.length;j++) {
			if((num % NUMBER_X[j]) == 0) {
				TIMES_X_BOOLEAN[j] = true;
			} else {
				TIMES_X_BOOLEAN[j] = false;
			}
		}
	}

	public void setNumberXXBoolean() {
		if((TIMES_X_BOOLEAN[0]) && (TIMES_X_BOOLEAN[1])) {
			TIMES_XX_BOOLEAN[0] = true;
		}
	}

	public void PrintNumber (int num) {
		if(TIMES_XX_BOOLEAN[0]) {
			System.out.print(TIMES_XX[0] + " ");
			return;
		} if(TIMES_X_BOOLEAN[0]) {
			System.out.print(TIMES_X[0] + " ");
			return;
		} if (TIMES_X_BOOLEAN[1]) {
			System.out.print(TIMES_X[1] + " ");
			return;
		}
		System.out.print(num + " ");
		return;
	}

	public void resetBoolean() {
		for(int i=0;i < TIMES_X_BOOLEAN.length;i++) {
			TIMES_X_BOOLEAN[i] = false;
		}
		for(int i=0;i<TIMES_XX_BOOLEAN.length;i++) {
			TIMES_XX_BOOLEAN[i] = false;
		}
	}

}

