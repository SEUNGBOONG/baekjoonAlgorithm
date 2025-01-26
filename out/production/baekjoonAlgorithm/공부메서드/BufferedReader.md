- BufferedReader 
  -  Scanner 와 유사하다 .
  - 속도 측면에서 빠르다.
  - 입력된 데이터가 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임
  - 많은 양의 데이터를 처리할 때 좋다. 

BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
String s = bf.readLine(); 
int i = Integer.parseInt(bf.readLine()); 

주의 해야 할점 
- 스트링으로 거정되게이 스트링이 아닌 다른타입을 입력받으려면 형변환을 꼭해주어야한다.
- 예외처리를 꼭해주어야한다. 