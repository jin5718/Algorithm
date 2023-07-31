############## 주의 ##############
# 입력을 받기위한 input 함수는 절대 사용하지 않습니다.
# 내장 함수 sum, min, max, len 함수를 사용하지 않습니다.
# 사용시 감점처리 되니 반드시 확인 바랍니다.
def solve09(n):
    # 재귀함수 형태로
    # 종료조건 (기저조건)
    if n < 10 :
        return n
    # 각 자릿수를 전부 더해
    # 반환해라
    # 123
    current = n % 10 
    # 나머지 자리
    next = n // 10 # 12
    return current + solve09(next)


def sum_digits(number):
    rufrhk = 0
    if number < 10 :
        skajwl = number % 10
        ahrt = number // 10
        rufrhk = skajwl + sum_digits(ahrt)
    return rufrhk

    # 여기에 코드를 작성하여 함수를 완성합니다.
    
# 아래 코드는 실행 확인을 위한 코드입니다.
if __name__ == '__main__':
    # 예시 코드는 수정하지 마세요.
    print(sum_digits(123))  # => 6
    # 여기부터 아래에 추가 테스트를 위한 코드 작성 가능합니다.
    