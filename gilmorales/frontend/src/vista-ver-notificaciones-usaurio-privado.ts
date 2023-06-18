import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver-notificaciones-usaurio-privado')
export class VistaVerNotificacionesUsaurioPrivado extends LitElement {
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
<vaadin-vertical-layout theme="spacing-s" id="vaadinVerticalLayout1" style="align-self: stretch; flex-grow: 1; width: 100%; height: 100%;">
 <h1 id="h1" style="align-self: center;">Notificaciones</h1>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: stretch;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1;">
   <h3 id="tituloNuevosSeguidores" style="align-self: flex-start; flex-shrink: 0; margin-left: var(--lumo-space-s);">Nuevos Seguidores:</h3>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaNuevosSeguidores" style="align-self: stretch; margin-left: var(--lumo-space-m); margin-right: var(--lumo-space-m); flex-shrink: 0;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout3">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout3">
   <h3 style="align-self: flex-start; flex-shrink: 0; margin-left: var(--lumo-space-s);" id="tituloMeGustas">Me Gustas:</h3>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaMeGustas" style="align-self: stretch; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout5">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout4">
   <h3 style="align-self: flex-start; flex-shrink: 0; margin-left: var(--lumo-space-s);" id="tituloComentarios">Comentarios:</h3>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutListaComentarios" style="align-self: stretch; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
