import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('ver-notificaciones-usaurio-privado')
export class VerNotificacionesUsaurioPrivado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: stretch;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-s);">
  <h1 id="h1" style="align-self: center;">Notificaciones</h1>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: stretch;">
   <vaadin-horizontal-layout theme="spacing" _vaadin_designer_import_href="import 'http://localhost:50171/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" id="vaadinHorizontalLayout2" style="flex-grow: 0; width: 25%;"></vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1;">
    <h3 id="tituloNuevosSeguidores" style="align-self: flex-start;">Nuevos Seguidores:</h3>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaNuevosSeguidores" style="align-self: stretch; margin: var(--lumo-space-s);"></vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout3">
   <vaadin-horizontal-layout theme="spacing" _vaadin_designer_import_href="import 'http://localhost:50171/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="flex-grow: 0; width: 25%;" id="vaadinHorizontalLayout4"></vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout3">
    <h3 style="align-self: flex-start;" id="tituloMeGustas">Me Gustas:</h3>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaMeGustas" style="align-self: stretch; margin: var(--lumo-space-s);"></vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="vaadinHorizontalLayout5">
   <vaadin-horizontal-layout theme="spacing" _vaadin_designer_import_href="import 'http://localhost:50171/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="flex-grow: 0; width: 25%;" id="vaadinHorizontalLayout6"></vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;" id="vaadinVerticalLayout4">
    <h3 style="align-self: flex-start;" id="tituloComentarios">Comentarios:</h3>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaComentarios" style="align-self: stretch; margin: var(--lumo-space-s);"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
