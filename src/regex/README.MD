1. Count duplicate words in a sentence|file|string block input.<br>
in : "he he goes to school"<br>
out: he: 2, goes: 1, school: 1<br>

2. Check whether an email address is valid or not.<br>
in : x@x.com out: valid <br>
in : x@x out: invalid<br>
in : x@x.com.bd.gov out: valid<br>
in : x.x@x.com out: valid<br>
in : ~x@x.com out: invalid<br>
in : "x@"x.com out: invalid<br>

3. Make a Ip(v4) address validator method.<br>
in : 10.10.10.10 out: valid<br>
in : 310.10.10.10 out: invalid<br>
in : 255.10.10.10 out: valid<br>
in : 2555.10.10.10 out: invalid<br>

4. Check if given time format is valid or not. Format: hh:mm:ss [12 hrs]<br>
in : 12.59.59 out: valid<br>
in : 12.60.59 out: invalid<br>

5. Check if given date format is valid or not. Format: dd/mm/yyyy [yyyy is valid upto 2014]<br>
in : 12/12/1212 : valid<br>
in : 12/13/1212 : invalid<br>
in : 12/12/12122 : invalid<br>
in : 32/12/1212 : invalid<br>

6. Check whether a html block is unique in a html file|string block input.
str: "<div>..</div><div>..</div><p>..</p>"<br>
in : div out: duplicate<br>
in : p out: uniqiue<br>
do this with java regex besides ur regex learning<br>

7. Validate "Day and month" format<br>
in : 2/29 out: invalid<br>
in : 1/30 out: invalid<br>

8. Only match constant in a set using "char set intersection"<br>

9. Match all odd numbers in a string containing both numbers and non numbers<br>
in: abcd12XY15c1552d13<br> out:15,13<br>

10.Match all words where 1st and last char is same<br>
in: all ala imi out: ala imi<br>

11.Match all words that contain at least one same uppercase and a lowercase letter<br>
in: "Mam Did You tesT alL Students"<br>
out: "Mam Did tesT alL Students"<br>

12. Match all string(words)where theres no substring "ab"<br>
in abad acdd adabdd<br>
out acdd

13. Match all strings/words that have exactly 3 'b' in total<br>
in: "abba abbab baba"<br>
out: "abbab"

14. how to compare two date, which one is greater<br>
01.11.2014 31.10.2019<br>