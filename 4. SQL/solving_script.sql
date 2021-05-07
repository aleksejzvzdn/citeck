SELECT id+1 as lost, next_id-id-1 as quantity
FROM(
  SELECT id, LEAD(id)OVER(ORDER BY id)as next_id
  FROM numbers
) AS x
WHERE id+1 != next_id