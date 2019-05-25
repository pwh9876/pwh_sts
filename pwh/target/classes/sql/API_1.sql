  SELECT T1.YEAR AS year,
         T3.ACNT_NM AS name,
         T2.ACNT_NO AS acctNo,
         T1.AMT AS sumAmt
    FROM (  SELECT YEAR, MAX(AMT) AMT
              FROM (  SELECT SUBSTRING(TRD_DT, 1, 4) YEAR,
                             ACNT_NO ACNT_NO,
                             SUM(AMT - CMSN) AMT
                        FROM TS_TBL_TRD
                       WHERE CANC_YN <> 'Y'
                    GROUP BY SUBSTRING(TRD_DT, 1, 4), ACNT_NO) AS T
          GROUP BY YEAR) T1
         JOIN
         (  SELECT SUBSTRING(TRD_DT, 1, 4) YEAR,
                   ACNT_NO ACNT_NO,
                   SUM(AMT - CMSN) AMT
              FROM TS_TBL_TRD
             WHERE CANC_YN <> 'Y'
          GROUP BY SUBSTRING(TRD_DT, 1, 4), ACNT_NO) T2
            ON T1.YEAR = T2.YEAR AND T1.AMT = T2.AMT
         JOIN TS_TBL_ACNT T3 ON T2.ACNT_NO = T3.ACNT_NO
ORDER BY YEAR;