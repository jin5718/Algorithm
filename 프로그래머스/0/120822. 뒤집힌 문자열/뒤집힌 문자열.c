#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string) {
    size_t len = strlen(my_string);
    char* answer = (char*)malloc(len);
    int j = len-1;
    for(int i = 0; i < len; i++){
        answer[j--] = my_string[i];  
    }
    answer[len] = '\0';
    return answer;
}