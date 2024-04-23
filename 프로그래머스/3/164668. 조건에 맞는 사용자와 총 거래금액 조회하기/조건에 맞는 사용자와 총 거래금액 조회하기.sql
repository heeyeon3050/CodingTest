SELECT USER_ID, NICKNAME, SUM(PRICE)
FROM USED_GOODS_BOARD B JOIN USED_GOODS_USER U ON B.WRITER_ID = U.USER_ID
WHERE STATUS = 'DONE'
GROUP BY U.USER_ID
HAVING SUM(PRICE) >= 700000
ORDER BY SUM(PRICE);