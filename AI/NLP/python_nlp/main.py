import nltk
from nltk.corpus import treebank
# nltk.download()
sentence = "sunxiebin is a good man"
tokens = nltk.word_tokenize(sentence)
print(tokens)
tagged = nltk.pos_tag(tokens)
print(tagged)

t = treebank.parsed_sents('wsj_0001.mrg')[0]
print(t)
t.draw()

#from nltk.chat import chatbots

#chatbots()

# import sys,os
# import nltk
# from nltk.corpus import treebank
# from nltk.tree import Tree

# reload(sys)
# sys.setdefaultencoding('utf-8')
# sentTree ="(IP (NP(NR 张三)) (VP(VV 参加) (AS 了) (NP (NN 会议))))"

# tree= Tree.fromstring(sentTree)
# tree.draw