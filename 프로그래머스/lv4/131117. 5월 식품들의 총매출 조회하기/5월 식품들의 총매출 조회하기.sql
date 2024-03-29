-- 코드를 입력하세요
SELECT A.PRODUCT_ID, A.PRODUCT_NAME, SUM(A.PRICE*B.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT A
JOIN FOOD_ORDER B
ON A.PRODUCT_ID = B.PRODUCT_ID
WHERE PRODUCE_DATE LIKE '2022-05%'
GROUP BY 1
ORDER BY TOTAL_SALES DESC, PRODUCT_ID;