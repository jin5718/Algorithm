#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int solution(const char* t, const char* p) {
    int answer = 0;
    int tlen = strlen(t);
    int plen = strlen(p);

    // 비교 대상 문자열을 숫자로 미리 바꿔놓음
    long long target = atoll(p);

    for (int i = 0; i <= tlen - plen; i++) {
        char txt[plen + 1];         // 부분 문자열 저장
        strncpy(txt, t + i, plen);  // 부분 복사
        txt[plen] = '\0';           // 문자열 종료

        long long now = atoll(txt); // 현재 부분 문자열 숫자 변환

        if (now <= target) {
            answer++;
        }
    }

    return answer;
}
