function solution(answers) {
    var answer = [];
    var reply1 = [1,2,3,4,5];
    var reply2 = [2, 1, 2, 3, 2, 4, 2, 5];
    var reply3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    var t_ans = [
        {name: 1, score: 0},
        {name: 2, score: 0},
        {name: 3, score: 0}
    ];

    for(var i = 0; i < answers.length; i++){
        if(answers[i] == reply1[i%5]) t_ans[0].score += 1;
        if(answers[i] == reply2[i%8]) t_ans[1].score += 1;
        if(answers[i] == reply3[i%10]) t_ans[2].score += 1;
    }

    t_ans.sort(function(a, b){
        return b["score"] - a["score"];
    });

    answer.push(t_ans[0].name);
    var top = t_ans[0].score;
    if(top == t_ans[1].score){
        answer.push(t_ans[1].name);
        if(top == t_ans[2].score){
            answer.push(t_ans[2].name);
        }
    }

    return answer;
}