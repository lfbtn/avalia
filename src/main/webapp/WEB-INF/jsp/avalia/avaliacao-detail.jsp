<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:set var="now" value="<%=new java.util.Date()%>" />
<script type="text/javascript">
	function printMeSubmitMe() {
		window.print();
	}
</script>
<style>
<!--
@media print {
	@page {
		margin: 0;
	}
	body {
		margin: 1.6cm;
	}
}
-->
</style>
<!-- <c:url value="/resources/" /> -->

  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Avaliacao
        <small>#0001801${avaliacao.id}</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Avaliações</a></li>
        <li><a href="#">Avaliação</a></li>
        <li class="active">Detalhes</li>
      </ol>
    </section>

    <div class="pad margin no-print">
      <div class="callout callout-info" style="margin-bottom: 0!important;">
        <h4><i class="fa fa-info"></i> Observação:</h4>
        Esta página é otimizada para impressão. Clique no botão de impressão no final da página.
      </div>
    </div>

    <!-- Main content -->
    <section class="invoice">
      <!-- title row -->
      <div class="row">
        <div class="col-xs-12">
          <h2 class="page-header">
            <i class="fa fa-globe"></i> Avaliação
            <small class="pull-right">Data: ${avaliacao.inclusao}</small>
          </h2>
        </div>
        <!-- /.col -->
      </div>
      <!-- info row -->
      <div class="row invoice-info">
        <div class="col-sm-4 invoice-col">
          Avaliação
          <address>
            <strong>UNIRV.</strong><br>
            FACULDADE DE ENGENHARIA DE SOFTWARE<br>
            Rio Verde - GO<br>
            ${avaliacao.professor}<br>
            Email: vanessaxcamargo@gmail.com
          </address>
        </div>
        <!-- /.col -->
        <div class="col-sm-4 invoice-col">
          Aluno
          <address>
            <strong>Nome: </strong><br>
            <br>
            <br>
            <br>
            
          </address>
        </div>
        <!-- /.col -->
        <div class="col-sm-4 invoice-col">
          <b>Prova nro #00181${avaliacao.id}</b><br>
          <br>
          <b>ID:</b> ${avaliacao.id}<br>
          <b>Data de Inclusão:</b> ${avaliacao.inclusao}<br>
          <b>Data de Aplicação:</b>${avaliacao.aplicacao}
        </div>
        
        <!-- /.col -->
      </div>
      <!-- /.row -->

      <div class="row">
        <div class="col-xs-12 table-responsive">
          <table class="table table-striped">
            <thead>
			<th>
			Questão
            </th>
            </thead>
            <tbody>
            <tr>
            <td></td>
            </tr>
            <c:forEach items="${avaliacao.perguntas}" var="pergunta">
            	<tr>
            		<td>${pergunta.pergunta}</td>
      			</tr>
      		</c:forEach>
            </tbody>
          </table>
		</div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
      
      
      
      
            <div class="row">
        <div class="col-xs-12 table-responsive">
          <table>
          <thead>
			<tr>
				<th>Id</th>
				<th>Pergunta teste</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${avaliacao.perguntas}" var="pergunta">
								<tr>
									<td><a href='<spring:url value="/perguntas/${pergunta.id}.html"></spring:url>'>${pergunta.id}</a></td>
									<td>${pergunta.pergunta}</td>
											
								</tr>
								<tr>
									<c:forEach items="${pergunta.respostas}" var="resposta">
										<tr>
											<td>${pergunta.id}${resposta.id}</td>
											<td>${resposta.texto}</td>
										</tr>
									</c:forEach>
								</tr>
							</c:forEach>
						</tbody>
			</table>
		</div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
      
      
      
      

      <!-- Table row -->
      <div class="row">
        <div class="col-xs-12 table-responsive">
          <table class="table table-striped">
            <thead>
            <tr>
              <th>Id</th>
              <th>Resposta</th>
              
            </tr>
            </thead>
            <tbody>
            <tr>
              <td>${avaliacao.perguntas[0].respostas[0].id}</td>
              <td>${avaliacao.perguntas[0].respostas[0].texto}</td>
              
            </tr>
            </tbody>
          </table>
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->


      <!-- this row will not appear when printing -->
      <div class="row no-print">
        <div class="col-xs-12">
          <a href="invoice-print.html" target="_blank" class="btn btn-default"><i class="fa fa-print"></i> Imprimir</a>
          
          <button type="button" class="btn btn-primary pull-right" style="margin-right: 5px;">
            <i class="fa fa-download"></i> Gerar PDF
          </button>
        </div>
      </div>
    </section>
    <!-- /.content -->

</div>
<!-- /.content-wrapper -->