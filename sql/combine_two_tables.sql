/*we need to combine 2 tables with columns firstname.lastname ,city and state.so lets start with
person table and check for each personid check if adressid exists id doesnt exist just fill with 
null values.if person doesnt exiat skip it*/

SELECT 
 p.firstName,
 p.lastName,
 a.city,
 a.state
FROM
 Person p
LEFT JOIN
 Adress a ON p.personId = a.personId
