### 小象学院AI校招班
这里为小象学院AI校招班专用刷题GitHub，旨在给每一位学员提供优质的服务  
[AI校招收割王](https://www.chinahadoop.cn/course/1431/landing/page)
#### 字符串 I
##### day1
**有效回文串** 题解：
首先，回文串的概念为对一个字符串而言，从前往后读和从后往前读是一样的。明确一点，空字符串也是回文串。
接下来，根据题目要求，由于字符串中存在一些特殊符号，比如逗号，在确认是否是回文串的过程中，这些特殊符号需要去除，
否则无法确认是否是回文串。
最后，我们需要两个指针，一前一后，同时往字符串的中间进行移动，每移动一位进行比较，如果相同就继续往下
比较，如果不同那么就跳出。
