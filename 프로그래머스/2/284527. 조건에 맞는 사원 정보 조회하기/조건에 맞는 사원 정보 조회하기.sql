SELECT SUM(SCORE) AS SCORE, E.EMP_NO, EMP_NAME, POSITION, EMAIL
FROM HR_EMPLOYEES E JOIN HR_GRADE H ON E.EMP_NO = H.EMP_NO
GROUP BY E.EMP_NO
ORDER BY SCORE DESC
LIMIT 1;
