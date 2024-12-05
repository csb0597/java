자바

package proj_nt;

import java.io.IOException;

public class NTmain {
    public static void main(String[] args) {
        try (NoteTaking nt = new NoteTaking("notes.txt")) {
            nt.writeNT("This is the first writing in this notes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

실행결과
---------------------------------------------------------------------
글을 작성하기 위해, notes.txt 파일을 열니다
This is the first writing in this notes를 파일에 기록(저장) 합니다
파일을 닫아서 글 작성을 마칩니다.
---------------------------------------------------------------------
