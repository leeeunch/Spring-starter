package hello.core.singleton;

public class SingletonService {
    // 자기 자신을 static 변수로 선언하여, static 영역에 단 하나만 저장됨
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }
    
    // 생성자
    private SingletonService () {
        
    }
    
    public void login() {
        System.out.printf("싱글톤 객체 로직 호출");
    }

}
