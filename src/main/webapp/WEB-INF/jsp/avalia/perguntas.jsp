<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <c:url value="/resources/" /> -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Perguntas<small>Cadastro de Perguntas</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Perguntas</a></li>
			<li class="active">Perguntas</li>
		</ol>
	</section>
	<!-- Main content -->
	<section class="content">
	<div class="row">
		<div class="col-xs-12">
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Perguntas</h3>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<!-- .box-body -->
					<table id="example10" class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Id</th>
								<th>Pergunta</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach items="${perguntas}" var="pergunta">
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
				<!-- /.box-body -->
				<div class="box-footer">
					<a href='<spring:url value="/pergunta-register.html"></spring:url>'>
						<button class="btn btn-primary">Nova Pergunta</button>
					</a>
				</div>
			</div>
			<!-- /.box -->
		</div>
		<!-- /.col -->
	</div>
	<!-- /.row --> </section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

