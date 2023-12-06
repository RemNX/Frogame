insert into cards select 23,0,0,0,1
where not exists (select * from cards where idc=23 and idp=1);

update cards
set nombre=(select nombre from cards where idc=23 and idp=1)+1
where idc=23 and idp=1;