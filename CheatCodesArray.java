//1. Convert an int[] -> Integer[]

int [] sameArray = arr;  
Integer[] what = Arrays.stream( sameArray ).boxed().toArray( Integer[]::new );
List<Integer> list = Arrays.asList(sameIntegerArray);

