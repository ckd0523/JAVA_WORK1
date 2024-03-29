package Problem.exam08;

public class ClassRoll {
	
	public static final int NOT_FOUND = -1;
	
    public String coursename; 			// 교과목명
    public int count;      					// 출석부에 있는 학생들의 수
    public int size;							// 출석부의 크기
    Student[] sbook; 						// Student 객체들의 배열
 
    
    public ClassRoll() {
    	size=10;
    	count=0;
    	
    	sbook = new Student[size];
    	
    }
    
    public void add(Student newStudent) {
    	if(count >= size) {
    		System.out.println("출석부의 크기 부족으로 추가할수 없습니다.");
    	}
    	else {
    		sbook[count] = newStudent;
    		count++;
    	}
    	
    }
    
    // 주어진 Student 객체의 출석부내의 위치(index)를 알려 준다.
    private int findIndex(int searchNumber) {
    	int index =NOT_FOUND;
    	for(int i=0; i<=size; i++) {
    		if(sbook[i].number==searchNumber) { index = i; break; }
    		else {index=NOT_FOUND;}
    	}
    	return index;
    }
    
    // 주어진 학번을 가진 Student 객체를 출석부에서 찾아서 이름를 알려준다.
    public String search(int seachNumber) {
    	if(findIndex(seachNumber)==-1) {return "주어진 학생이 출석부에 없습니다.";}
    	else {return sbook[findIndex(seachNumber)].name;}
    }

    }
    

