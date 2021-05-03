# Christmas_Tree

# Description

提前預祝各位聖誕快樂! (X)

大家來用程式碼刻刻聖誕樹吧!

詳細輸入、輸出請看輸入、輸出說明與範例, 

但是這個練習有額外的要求, 請至少設計兩個 methods,

一個是負責檢查 input 每個值是否在合理範圍, 請思考參數怎麼設計才能根據不同規則做檢查。檢查規則如下:

- 聖誕樹的層數 (2 ≤ layer ≤ 5)
- 最上面那層的邊長 (3 ≤ side_length ≤ 6)
- 越往下一層邊長會多多少 (1 ≤ growth ≤ 5)
- 樹幹寬度 (3 ≤ trunk_width ≤ 9, need odd)
- 樹幹高度 (4 ≤ trunk_height ≤ 10)

一個是負責多次輸出同一個符號, 請思考參數怎麼設計才能根據不同符號和次數來畫樹。

# Input Description

會有五個數值, 分別代表: 聖誕樹的層數、最上面那層的等腰邊長、越往下一層兩側邊等腰邊長會多多少 、樹幹寬度、樹幹高度

# Input Example

3 3 3 3 4

1 3 3 3 4

# Output Description

根據輸入值畫出聖誕樹,

每個聖誕樹最後一層的前面預設會有 10 個空白格, 請自行將每一行都加上 10 個空白格。

邊以"*"表示, 每一層裡面以"@"表示, 樹幹以"|"表示。

若是輸入值有任一是不合格的, 則輸出 "Invalid input."

# Ouput Example


                  *
                 *@*
                *****
                 *@*
                *@@@*
               *@@@@@*
              *@@@@@@@*
             ***********
                 *@*
                *@@@*
               *@@@@@*
              *@@@@@@@*
             *@@@@@@@@@*
            *@@@@@@@@@@@*
           *@@@@@@@@@@@@@*
          *****************
                 |||
                 |||
                 |||
                 |||
Invalid input.


# Hint

1. 程式說明：因為系統會賦予數量不一的測試資料來測驗您的程式是否正確，因此必須先以一個 while 迴圈來讀取所有的測試資料。如有疑問，請參考 [範例程式碼](http://140.119.163.240/UserGuide.jsp#Samplecode)
2. 有些地方印出來的排版比較好看, 但是有些地方的結果比較難看(例如自行填入測資會長的不像樹), 這是正常的, 但這都只是"看"起來, 比對結果還是一定的。
3. 每一層的邊長最上面那一顆是會和上一層連在一起的。
