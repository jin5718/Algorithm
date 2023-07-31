def find_one(matrix):
    length = 0
    for _ in matrix:
        length += 1
    # 이차원 배열 matrix
    # 1의 값을 가지고 있는
    # 행과 열을 tuple로 반환
    for row in range(len(matrix)):
        for col in range(len(matrix[row])):
        #for col in range(len(matrix[0])):
            if matrix[row][col] == 1:
                return row,col
        