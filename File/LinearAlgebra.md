> [麻省理工线性代数辅导课](https://www.bilibili.com/video/BV18W411v77N)
## 线性代数几何表示
$$
\begin{cases}
2x+y=1; \\
x-2y=-1.
\end{cases}
$$
> - 行视点<br/>
> 直线相交
> - 列视点
> $V_1 = (2,1)$ $V_2 = (1,-2)$ $V_3 = (1,-1)$<br/>
> $V_1 x +V_2 y = V_3$
## 线性空间
线性子空间
## 行列式
## 行列式与体积
$$
|\alpha_1, \alpha_2, \alpha_3|=|det(A)|=Vol(六面体（\alpha_1, \alpha_2, \alpha_3）)
$$
## 微分方程指数矩阵
$$
y'''+2y''-y'-2y=0\quad
y(t)\\
\begin{cases}
u(t)=\begin{bmatrix}
y''\\
y'\\
y
\end{bmatrix}\\
\\
u'(t)=\begin{bmatrix}
y'''\\
y''\\
y'
\end{bmatrix}
\end{cases}\\
\begin{cases}
u'(t)=A\cdot u(t)\\
\begin{bmatrix}
y'''\\
y''\\
y'
\end{bmatrix}
=
\begin{bmatrix}
-2&1&2\\
1&0&0\\
0&1&1
\end{bmatrix}\cdot
\begin{bmatrix}
y''\\
y'\\
y
\end{bmatrix}
\end{cases}\\
求解A特征值\&特征向量\\ 
det(A-\lambda I)=
det\begin{pmatrix}
-2-\lambda&1&2\\
1&-\lambda&0\\
0&1&-\lambda
\end{pmatrix}=(1-\lambda)(1+\lambda)(2+\lambda)
$$