<html>
	<body>
         <p> ${Session.courseName} </p>
         <form action="viewQuiz" method="POST">
         <select name="Quiz">
         <#list Session.QuizHashMap as quizId, quizTitle>
          <option value=${quizId}> ${quizTitle}</option>
           </#list>
         </select>
         <input type ="submit" value="ViewQuiz"/>
         </form>
         <form action="createQuiz" method="GET">
         <input type ="submit" value="CreateQuiz"/>
         </form>
          <form>
         <input type ="submit" value="Statistics"/>
         </form>
	</body>
</html>