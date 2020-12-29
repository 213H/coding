## 素数无限定理
### Euclid
$$
let \, prime \, numbers: \, p_1, p_2, \cdots , p_n; \\
s = p_1p_2 \cdots p_n + 1;\\
if\, s\, is\, a\  prime\  number\\
if\, s\, not\, a\, prime\, number 
$$
## 欧拉定理
$$
e^{ix} = i\sin(x) + \cos(x)
$$
## 雅可比行列式
$$
\iint_D f(x,y) dxdy\quad x=x(u,v),\quad y=y(u,v);\\
J=\begin{vmatrix}
\frac{\partial x}{\partial u}&&\frac{\partial x}{\partial v}\\
\frac{\partial y}{\partial u}&&\frac{\partial y}{\partial v}
\end{vmatrix}\\
\implies \iint_{D'} f(x(u,v),y(u,v)) |J|dudv;
$$
## 费马大定理
$$
\begin{aligned}
&对于n>2,n\in N^+,不定方程\hspace{100cm}\\
&x^n + y^n = z^n\\
&无整数解
\end{aligned}
$$
## 向量积
$$
a\times b=(l,m,n)\times (o,p,q)=\\
\begin{bmatrix}
l&m&n&l&m&n\\
o&p&q&o&p&q
\end{bmatrix}\\
mq-np,no-lq,lp-mo
$$
## 勾股定理
## 例1
$$
数列|a_n|中,a_1=\frac{3}{2},对任何n>=2,n\in\N^+,都有a_n=\frac{3n\cdot a_{n-1}}{2a_{n-1}+(n-1)}.\\
(1)求通项公式a_n;\\
(2)证明:对任何n\in\N^+,a_1\cdot a_2\cdot\cdots\cdot a_n<2\cdot n!
$$
$$
\frac{1}{3a_n\cdot a_{n-1}}\cdot(a_n=\frac{3n\cdot a_{n-1}}{2a_{n-1}+(n-1)})\\
\implies \frac{1}{3a_{n-1}}=\frac{\frac{n}{a_n}}{2a_{n-1}+(n-1)},\\
\implies \frac{n}{a_n}=\frac{2a_{n-1}+(n-1)}{3a_{n-1}}=\frac{1}{3}(\frac{n-1}{a_{n-1}+2,})\\
\implies \frac{n}{a_n}-1=\frac{1}{3}(\frac{n-1}{a_{n-1}-1}).\\
\therefore 数列{\frac{n}{a_n}-1} 公比\frac{1}{3} 首项\frac{1}{a_1}-1=\frac{1}{3}等比数列.
$$
## 
Let $a$ and $b$ be positive integers such that $ab + 1$ divides $a^2 + b^2$. Show that 
$$\frac{a^2+b^2}{ab+1}$$
is the square of an integer.