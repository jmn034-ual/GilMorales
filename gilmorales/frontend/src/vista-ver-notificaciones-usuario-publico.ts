import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver-notificaciones-usuario-publico')
export class VistaVerNotificacionesUsuarioPublico extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: stretch; flex-grow: 1; width: 100%; height: 100%; overflow-y: auto;">
 <h1 id="h1" style="align-self: center;">Notificaciones</h1>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1; margin-left: 25%;">
   <h3 id="tituloNuevosSeguidores" style="align-self: flex-start;">Nuevos Seguidores:</h3>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaNuevosSeguidores" style="align-self: stretch; align-items: center; margin-top: var(--lumo-space-xs); margin-right: var(--lumo-space-xl);"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout3">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; margin-left: 25%;" id="vaadinVerticalLayout3">
   <h3 style="align-self: flex-start;" id="tituloMeGustas">Me Gustas:</h3>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaMeGustas" style="align-self: stretch; align-items: center; margin-top: var(--lumo-space-xs); margin-right: var(--lumo-space-xl);"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout5">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; margin-left: 25%;" id="vaadinVerticalLayout4">
   <h3 style="align-self: flex-start;" id="tituloComentarios">Comentarios:</h3>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaComentarios" style="align-self: stretch; align-items: center; margin-top: var(--lumo-space-xs); margin-right: var(--lumo-space-xl);"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="verticalMenciones" style="align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="horizontalMenciones" style="flex-grow: 1; margin-left: 25%;">
   <h3 id="tituloMenciones" style="align-self: flex-start;">Menciones:</h3>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaMenciones" style="align-self: stretch; align-items: center; margin-top: var(--lumo-space-xs); margin-right: var(--lumo-space-xl);"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
