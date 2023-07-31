def get_row_col_maxsum(matrix):
    # 열과 행에 대한 길이
    row_len = 0 # 열의 길이
    col_len = 0 # 행의 길이
    for _ in matrix:
        row_len += 1


    for c in matrix[0]:
        col_len += 1


    # 가로 합을 구하고 최댓값 갱신
    mx_col = 0
    for r in range(row_len):
        total = 0
        for c in range(col_len):
            total += matrix[r][c]

        if mx_col < total:
            mx_col = total
    
    # 세로 합에 구하고 최댓값 갱신
    mx_row = 0
    for r in range(col_len):
        total = 0
        for c in range(row_len):
            total += matrix[r][c]

        if mx_row < total:
            mx_row = total