// 소수 구하는 로직

    static void getPrime(int N) {
        int[] temp = new int[N + 1];
        int rootN = (int)Math.sqrt(N);

        for (int i = 2; i <= N; i++) {
            temp[i] = i;
        }

        for (int i = 2; i <= rootN; i++) {
            if (temp[i] != 0) {
                for (int j = i + i; j <= N; j += i) {
                    temp[j] = 0;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (temp[i] != 0) {
                primelist.add(temp[i]);
            }
        }
    }
