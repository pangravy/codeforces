import java.util.*;
public class codeforces15 {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);


                int t = scanner.nextInt();
                while (t-- > 0) {
                    int n = scanner.nextInt();
                    int k = scanner.nextInt();

                    int[] a = new int[n];
                    List<Pair<Integer, Integer>> v = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        a[i] = scanner.nextInt();
                        v.add(new Pair<>(a[i], i));
                    }

                    Collections.sort(v, new Comparator<Pair<Integer, Integer>>() {
                        @Override
                        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
                            return p1.getKey().compareTo(p2.getKey());
                        }
                    });

                    int[] b = new int[n];
                    for (int i = 0; i < n; i++) {
                        b[i] = scanner.nextInt();
                    }
                    Arrays.sort(b);

                    int[] c = new int[n];
                    for (int i = 0; i < n; i++) {
                        c[v.get(i).getValue()] = b[i];
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.print(c[i] + " ");
                    }
                    System.out.println();
                }
                scanner.close();
            }

            static class Pair<K, V> {
                private K key;
                private V value;

                public Pair(K key, V value) {
                    this.key = key;
                    this.value = value;
                }

                public K getKey() {
                    return key;
                }

                public V getValue() {
                    return value;
                }
            }
    }

