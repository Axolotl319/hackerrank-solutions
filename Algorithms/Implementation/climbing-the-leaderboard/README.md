## [Climbing the Leaderboard](https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem)

**Domain:** Algorithms  
**Subdomain:** Implementation  
**Difficulty:** Medium  

**Problem Description:**

<div class='challenge_problem_statement'><div class='msB challenge_problem_statement_body'><div class='hackdown-content'><p>An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses <a href="https://en.wikipedia.org/wiki/Ranking#Dense_ranking_.28.221223.22_ranking.29">Dense Ranking</a>, so its leaderboard works like this:  </p>

<ul>
<li>The player with the highest score is ranked number  on the leaderboard. </li>
<li>Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.</li>
</ul>

<p><strong>Example</strong>  </p>

<p> <br>
  </p>

<p>The ranked players will have ranks , , , and , respectively.  If the player's scores are ,  and , their rankings after each game are ,  and . Return .</p>

<p><strong>Function Description</strong>  </p>

<p>Complete the <em>climbingLeaderboard</em> function in the editor below.  </p>

<p>climbingLeaderboard has the following parameter(s):  </p>

<ul>
<li><em>int ranked[n]</em>: the leaderboard scores  </li>
<li><em>int player[m]</em>: the player's scores  </li>
</ul>

<p><strong>Returns</strong>  </p>

<ul>
<li><em>int[m]:</em>  the player's rank after each new score</li>
</ul></div></div></div><div class='challenge_input_format'><div class='msB challenge_input_format_title'><p><strong>Input Format</strong></p></div><div class='msB challenge_input_format_body'><div class='hackdown-content'><p>The first line contains an integer , the number of players on the leaderboard. <br>
The next line contains  space-separated integers , the leaderboard scores in decreasing order. <br>
The next line contains an integer, , the number games the player plays. <br>
The last line contains  space-separated integers , the game scores.</p></div></div></div><div class='challenge_constraints'><div class='msB challenge_constraints_title'><p><strong>Constraints</strong></p></div><div class='msB challenge_constraints_body'><div class='hackdown-content'><ul>
<li></li>
<li></li>
<li> for </li>
<li> for </li>
<li>The existing leaderboard, , is in <em>descending</em> order.</li>
<li>The player's scores, , are in <em>ascending</em> order.</li>
</ul>

<p><strong>Subtask</strong></p>

<p>For  of the maximum score:</p>

<ul>
<li></li>
<li></li>
</ul></div></div></div>
